/**
 * Copyright 2015-2016 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sample.mybatis.domain.Hotel;

// 不需要设置 @Component 也能进行注入
@Mapper // 表明这是一个 Mapper 接口，其 XML 配置文件在 application.properties 中配置
@Transactional(propagation = Propagation.REQUIRED,
        isolation = Isolation.READ_COMMITTED,
        timeout = 36000,
        rollbackFor = Exception.class)
public interface HotelMapper {

    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.READ_UNCOMMITTED,
            timeout = 36000,
            rollbackFor = Exception.class)
    Hotel selectByCityId(int city_id);
}
