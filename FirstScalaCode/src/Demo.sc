object Demo {
  // Print
  println("Hello World")                          //> Hello World

	// var
	var i : Int = 5;                          //> i  : Int = 5

	println(i)                                //> 5
	
	// val
	val k = 3                                 //> k  : Int = 3
	
	var j = 8.+(5)                            //> j  : Int = 13
	
	// Class, object, constructor, method
	case class Student(var rollnum : Int = 1, var name : String = "Yuhang", var marks : Int = 100)
	{
		def show() =
		{
			println("hi")
		}
		
		def >(s2 : Student) : Boolean = marks > s2.marks
	}
	
	var s1 = Student(2,"Eric",90)             //> s1  : Demo.Student = Student(2,Eric,90)
	s1.show()                                 //> hi
	
	var s2 = Student()                        //> s2  : Demo.Student = Student(1,Yuhang,100)
	
	s1 > s2                                   //> res0: Boolean = false
	
	// List and methods
	var nums = List(3,4,5,6)                  //> nums  : List[Int] = List(3, 4, 5, 6)

	for (n <- nums)
		println(n)                        //> 3
                                                  //| 4
                                                  //| 5
                                                  //| 6

	nums.reverse                              //> res1: List[Int] = List(6, 5, 4, 3)
	
	nums.drop(2)                              //> res2: List[Int] = List(5, 6)
	
	nums.take(2)                              //> res3: List[Int] = List(3, 4)
	
	nums.head                                 //> res4: Int = 3
	
	nums.tail                                 //> res5: List[Int] = List(4, 5, 6)
	
	// Syntactic Sugar
	nums drop 2                               //> res6: List[Int] = List(5, 6)
	
	// List of different types element
	var numsAny = List(3, 5.5, true, "Hi")    //> numsAny  : List[Any] = List(3, 5.5, true, Hi)
	
	// List of objects
	var students = List(Student(1,"YUHANG",70), Student(2,"JINFANG",80), Student(3,"ERIC",90))
                                                  //> students  : List[Demo.Student] = List(Student(1,YUHANG,70), Student(2,JINFAN
                                                  //| G,80), Student(3,ERIC,90))
	
	// Lambda function
	nums.foreach { i : Int => println(i) }    //> 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
  // List method "filter"
	students.filter(s => s.marks >= 75)       //> res7: List[Demo.Student] = List(Student(2,JINFANG,80), Student(3,ERIC,90))
	
	// List method partition
	var parts = students.partition(s => s.marks == 80)
                                                  //> parts  : (List[Demo.Student], List[Demo.Student]) = (List(Student(2,JINFANG
                                                  //| ,80)),List(Student(1,YUHANG,70), Student(3,ERIC,90)))
	
	
	var p1 = parts._1                         //> p1  : List[Demo.Student] = List(Student(2,JINFANG,80))
	
	// Tuple
	var (part1, part2) = students.partition(s => s.marks == 80)
                                                  //> part1  : List[Demo.Student] = List(Student(2,JINFANG,80))
                                                  //| part2  : List[Demo.Student] = List(Student(1,YUHANG,70), Student(3,ERIC,90)
                                                  //| )
	
}