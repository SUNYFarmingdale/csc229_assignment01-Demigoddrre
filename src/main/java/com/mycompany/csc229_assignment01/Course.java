/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
private int id;
private String name;
private String code;
// defualt constructor which defins deafult values for class data members 
public Course(){
     setID(00);
    setName("Demi");
    setCode("101");
}
// parameterized constructor which sets the class data members to the values passed as arguments.
public Course(int id, String name, String code){
    setID(id);
    setName(name);
    setCode(code);
    
}

// getter method sused to retrieve data
public int getID(){
    return id;

}

public String getName(){
    return name;
}

public String getCode(){
    return code;
}

// setter methods which allow th user to set and update individual data members

public void setID(int id){

this.id = id;
}

public void setName(String name){
    this.name = name;
    
}

public void setCode(String code){
   this.code = code;
}
}


