***
## Add new Person:
- POST localhost:8080/persons
  -Body:
  {
  "name": "José",
  "surname": "Martínez",
  "neighborhood": "Cerro Chico",
  "address": "Virrey Melo 3611",
  "dateOfBirth": "1950-07-12"
  }

## Get all Persons:
- GET localhost:8080/persons

***

## Create new Zone Supervisor
- POST localhost:8080/zonesupervisors
  -Body:
  {
  "name": "Tao",
  "recyclingZoneState": "OK",
  "occupancyCapacity": "FULL",
  "recyclingZone":{"id":1}          //add this line if already exist almost one Recycling Zone  
  }

## Get all Zone Supervisors:
- GET localhost:8080/zonesupervisors

## Delete Zone Supervisor
- DELETE localhost:8080/zonesupervisors/```Supervisor_id```

***

## Create new recycling zone:
- POST localhost:8080/recyclingzones

  - Body:
    {
    "name": "Eco Punto - Hiper Libertad",
    "adress": "5008, Fray Luis Beltrán, Córdoba",
    "latitude": "-31.3646209",
    "longitude": "-64.2876681",
    "containers": [
    {
    "capacity": "1000",
    "type": 0,
    "occupancyCapacity": 1
    },
    {
    "capacity": "1000",
    "type": 1,
    "occupancyCapacity": 2
    },
    {
    "capacity": "1000",
    "type": 2,
    "occupancyCapacity": 3
    },
    {
    "capacity": "1000",
    "type": 3,
    "occupancyCapacity": 0
    }
    ]

}

## Get all recycling zones:
- GET localhost:8080/recyclingzones

## Get distance between two Recycling Zones:
- GET localhost:8080/distance/```zone_id```/```otherZone_id```

## Get all recycling zones:
- GET localhost:8080/recyclingzones

***

## Create new complaint:
- POST localhost:8080/complaints
  - Body:
    {
    "person": {"id":1},
    "complaintReason": 1, // 0-MISUSE 1-VANDALISM 2-OTHER
    "description": "One of the containers was destroyed"
    }

## Get all complaints:
- GET localhost:8080/complaints

***

## Get Occupancy Capacity:
- GET localhost:8080/capacity/```zone_id```

***
