package models

/**
 * @author Daniel Bartolomé
 * 
 * Factory of BBDD Dynamo
 */
class DynamoDAOFactory  extends DAOFactory{
  
    // In these test library AWScala default use dynamo local. That isn't necessary
    final var uri = "http://localhost:8000"
    
    // Create a connection to database nosql dynamo
    def newConnection() {}
    
    // method to get Rubrick DAO
    def getRubrickDAO() : RubrickDAO  = new models.DynamoRubrickDaoImpl
  
    
}