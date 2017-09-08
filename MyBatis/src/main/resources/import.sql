IF OBJECT_ID('city') IS NOT NULL
    BEGIN
        DROP TABLE city;
    END;
IF OBJECT_ID('hotel') IS NOT NULL
    BEGIN
        DROP TABLE hotel;
    END;

CREATE TABLE city
    (
      id INT PRIMARY KEY
             IDENTITY ,
      name VARCHAR(500) ,
      state VARCHAR(500) ,
      country VARCHAR(500)
    );
CREATE TABLE hotel
    (
      city INT ,
      name VARCHAR(500) ,
      address VARCHAR(500) ,
      zip VARCHAR(500)
    );

INSERT  INTO city
        ( name, state, country )
VALUES  ( 'San Francisco', 'CA', 'US' );
INSERT  INTO hotel
        ( city ,
          name ,
          address ,
          zip
        )
VALUES  ( 1 ,
          'Conrad Treasury Place' ,
          'William & George Streets' ,
          '4001'
        );