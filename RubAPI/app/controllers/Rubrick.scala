package controllers

import play.api.libs.json.{JsObject, Json}
import play.api.mvc.{BodyParsers, Action, Controller}
//import play.modules.reactivemongo.MongoController
//import play.modules.reactivemongo.json.collection.JSONCollection
import play.api.libs.concurrent.Execution.Implicits.defaultContext
//import reactivemongo.bson.BSONDocument
//import play.modules.reactivemongo.json.BSONFormats._
//import play.modules.reactivemongo.json.ImplicitBSONHandlers._
//import reactivemongo.core.actors.Exceptions.PrimaryUnavailableException

import awscala._, dynamodbv2._
import awscala.Region



object Rubrick extends Controller  {

  
      def list = Action {
        Ok("Hello Play Framework")
      }

// TEST OF CONTROLLER
      
//  val dynamoDB = dynamodbv2.DynamoDB.at(awscala.Region.Tokyo)
//  
//  val tableMeta: TableMeta = dynamoDB.createTable(
//  name = "Members",
//  hashPK =  "Id" -> AttributeType.Number,
//  rangePK = "Country" -> AttributeType.String,
//  otherAttributes = Seq("Company" -> AttributeType.String),
//  indexes = Seq(LocalSecondaryIndex(
//    name = "CompanyIndex",
//    keySchema = Seq(KeySchema("Id", KeyType.Hash), KeySchema("Company", KeyType.Range)),
//    projection = Projection(ProjectionType.Include, Seq("Company"))
//  ))
//)

//  def collection = db.collection[JSONCollection]("posts")

//  def list = Action.async {
//    val futureInt = scala.concurrent.Future { intensiveComputation() }
//    futureInt.map(i => Ok("Got result: " + i))
//  }
  
//    def list = Action {
//  Ok("Hello world")
//}      
      
      
//  def list = Action.async {implicit request =>
//    val tableMeta: Future[List[Int]] = Future { dynamoDB.createTable(
//  name = "Members",
//  hashPK =  "Id" -> AttributeType.Number,
//  rangePK = "Country" -> AttributeType.String,
//  otherAttributes = Seq("Company" -> AttributeType.String),
//  indexes = Seq(LocalSecondaryIndex(
//    name = "CompanyIndex",
//    keySchema = Seq(KeySchema("Id", KeyType.Hash), KeySchema("Company", KeyType.Range)),
//    projection = Projection(ProjectionType.Include, Seq("Company"))
//  ))
//)  
//      .recover {case PrimaryUnavailableException => InternalServerError("Pleas install MongoDB")}
//  }  
  
}
