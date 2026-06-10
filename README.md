1. from spring.io and added these dependencies: i. Lombok: To reduce boilerplate code ii. MongoDB: A NoSQL database use for storing data in Documents format or JSON/BSON iii. Validation: To validate the schema of the database if some critera are not filled in iv. Spring Web:

2. Created The packages
     i. Entity/Model: This is structure of database/the blueprint 
     ii. Repository: The Interface that extends MongoRepository 
     iii. Service: This is the business Logic of the application 
     iv. Controller: The creation and linking of endpoint gotten from the service package 
      v. Exception: Instead of Postman or any tools for testing our API giving us NULL messages, we can raise or throw our own messages

3. Testing the Enpoints
   http:localhost:5000/api/employees
   GET: localhost:5000/api/employees/{id}
   Post: post in a json format{
   id: 3, firstName, LastName:....}
   Update: localhost:5000/api/employees/{id}
   delete:localhost:5000/api/employees/{id}
