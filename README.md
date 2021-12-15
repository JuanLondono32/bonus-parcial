# Juan Camilo Londoño Jaimes - 2172006
# Laura Daniela Serrano Villanova - 2162113

# mongo-spring

__Para compilar:__
_mvn compile_

__Para ejecutar Tests:__
_mvn test_

__Para crear artefacto de despliegue (.jar)__
_mvn package_

__Para ejecutar usando spring pluging__ _mvn spring-boot:run_

__Para ejecutar archivo docker-compose.yaml__ _docker-compose -f docker-compose.yaml up -d_


__Post:__
_POST [http://localhost:8090/create](http://localhost:8090/create)_

_Body:_

{
"name":"Frozen",
"category": "Drama",
"rating": "3"
}

__Get:__
_GET [http://localhost:8090/id](http://localhost:8090/id)_

__Get:__
_GET [http://localhost:8090/](http://localhost:8090/)_

__Update:__
_PUT [http://localhost:8090/update/id](http://localhost:8090/user/id)_

_Body:_

{
"name":"Frozen",
"category": "Drama",
"rating": "3"
}

__Delete:__
_DELETE [http://localhost:8090/delete/id](http://localhost:8090/delete/id)_
