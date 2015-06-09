package models

import scala.annotation.switch
import models._

/**
 * @author Daniel Bartolomé
 * 
 * Abstract of Factory
 */
abstract class DAOFactory {
  
  // List of DAO's types. That is needed future changes 
  final var DYNAMO = 1
  
  def getRubrickDAO(){}

  def getDAOFactory(selectedFactory : Int)=   {
      if (selectedFactory == DYNAMO) new models.DynamoDAOFactory
      
//      selectedFactory match {
//        case this.DYNAMO  => models.DynamoDAOFactory
//        // list of other factories
//      }
  }
    
}