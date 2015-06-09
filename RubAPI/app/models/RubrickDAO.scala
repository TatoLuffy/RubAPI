package models

/**
 * @author Daniel Bartolomé
 * 
 * Interface of DynamoRubrickDAOImpl
 */
trait RubrickDAO {
    def create()
    def update()
    def list()
    def retrieve()
    def delete()
}