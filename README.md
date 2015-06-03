# RubAPI
CRUD example play framework

https://docs.google.com/document/d/1ADOZnF4ORURNP47EIFy7oL1ohn97I4IqOBGUsBEZ-2o/mobilebasic

Rubric API definition of done:

As an expert user, I should be able to create, update, list, retrieve and delete a rubric with help of restful APIs.
The CRUD endpoints should be developed using typesafe-play framework (Using either JAVA or Scala, extra points for Scala).
The data should be stored on Database (Either SQL or NoSQL, extra points for NoSQL).

Rubric should support the following fields:

Rubric {
id (String, optional): Unique Identifier,
publisher_id (String): MetaCog Platform Publisher ID. it can be any string
token (String): MetaCog Platform Security Token,
name (String): name of the rubric,
dimensions (JSONarray[Dimension]): A rubric can have many dimensions
}

Dimension {
name (String): name of the dimension,
type (String): type of value for this dimension,
indicators (JSONarray[String], optional): labels to use as applied indicators
}
Source code should be delivered through a github repo, with regular commits as in a normal project
 
 
You will be scored on the following:
1.     Design of the API
2.     DAO class definitions
3.     Synchronous vs Asynchronous calls
4.     Test cases with 80% code coverage
5.  Extra points task
 
*Links that may be of help:
PlayFramework 
                https://www.google.com/url?   q=https%3A%2F%2Fwww.playframework.com&sa=D&sntz=1&usg=AFQjCNG77lm8egpB0DZh4u8ZHAyuy9c6eA
