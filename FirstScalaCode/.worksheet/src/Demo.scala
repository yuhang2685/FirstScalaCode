object Demo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(49); 
  // Print
  println("Hello World");$skip(27); 

	// var
	var i : Int = 5;System.out.println("""i  : Int = """ + $show(i ));$skip(13); ;

	println(i);$skip(21); 
	
	// val
	val k = 3;System.out.println("""k  : Int = """ + $show(k ));$skip(18); 
	
	var j = 8.+(5)
	
	// Class, object, constructor, method
	case class Student(var rollnum : Int = 1, var name : String = "Yuhang", var marks : Int = 100)
	{
		def show() =
		{
			println("hi")
		}
		
		def >(s2 : Student) : Boolean = marks > s2.marks
	};System.out.println("""j  : Int = """ + $show(j ));$skip(270); 
	
	var s1 = Student(2,"Eric",90);System.out.println("""s1  : Demo.Student = """ + $show(s1 ));$skip(11); 
	s1.show();$skip(22); 
	
	var s2 = Student();System.out.println("""s2  : Demo.Student = """ + $show(s2 ));$skip(11); val res$0 = 
	
	s1 > s2;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(49); 
	
	// List and methods
	var nums = List(3,4,5,6);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(31); 

	for (n <- nums)
		println(n);$skip(15); val res$1 = 

	nums.reverse;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(16); val res$2 = 
	
	nums.drop(2);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(16); val res$3 = 
	
	nums.take(2);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(13); val res$4 = 
	
	nums.head;System.out.println("""res4: Int = """ + $show(res$4));$skip(13); val res$5 = 
	
	nums.tail;System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(35); val res$6 = 
	
	// Syntactic Sugar
	nums drop 2;System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(78); 
	
	// List of different types element
	var numsAny = List(3, 5.5, true, "Hi");System.out.println("""numsAny  : List[Any] = """ + $show(numsAny ));$skip(114); 
	
	// List of objects
	var students = List(Student(1,"YUHANG",70), Student(2,"JINFANG",80), Student(3,"ERIC",90));System.out.println("""students  : List[Demo.Student] = """ + $show(students ));$skip(62); 
	
	// Lambda function
	nums.foreach { i : Int => println(i) };$skip(63); val res$7 = 
  // List method "filter"
	students.filter(s => s.marks >= 75);System.out.println("""res7: List[Demo.Student] = """ + $show(res$7));$skip(80); 
	
	// List method partition
	var parts = students.partition(s => s.marks == 80);System.out.println("""parts  : (List[Demo.Student], List[Demo.Student]) = """ + $show(parts ));$skip(23); 
	
	
	var p1 = parts._1;System.out.println("""p1  : List[Demo.Student] = """ + $show(p1 ));$skip(73); 
	
	// Tuple
	var (part1, part2) = students.partition(s => s.marks == 80);System.out.println("""part1  : List[Demo.Student] = """ + $show(part1 ));System.out.println("""part2  : List[Demo.Student] = """ + $show(part2 ))}
	
}
