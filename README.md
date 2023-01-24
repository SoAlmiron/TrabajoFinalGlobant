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
    "type": 0
    },
    {
    "capacity": "1000",
    "type": 1
    },
    {
    "capacity": "1000",
    "type": 2
    },
    {
    "capacity": "1000",
    "type": 3
    }

    ]

}

- GET localhost:8080/recyclingzones

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