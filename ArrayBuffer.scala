import scala.collection.mutable.ArrayBuffer
object Stmarks{ def main(args:Array[String]): Unit = {

//Creating A Case Class StMarks to hold student details
  case class StMarks(name: String, gender: String, cat1: Int,cat2: Int,exam: Int)

//A sum function to return the sum of the integer values
  def sum(m1:Int,m2:Int,m3:Int): Int={ m1+m2+m3}

//A grade function to return the grade of the corresponding marks
  def grade(mark:Int): String={if( mark >= 70 )"A"
  else if( mark >= 60 )"B" else if( mark >= 50 )"C"else if( mark >= 40 )"D" else "F"
  }

//Creating the array Buffer to store StMarks
  val Marks = ArrayBuffer[StMarks]()

//Adding a StMarks record to the array Buffer marks
  Marks +=StMarks("Faith","F",9,11,33)

// Adding a list of StMarks records to the array Buffer marksMarks++=List(StMarks("Joyce","F",5,18,35),StMarks("John","M",7,8,28),StMarks("Joseph","M",8,12,38))

//Printing the first record the array Buffer
  println( "Head of Marks List : " + Marks.head )

//Printing all the records in the array Buffer
  Marks.foreach(println)

//Printing just student names
  Marks.foreach(m=>println(m.name))

//Printing The sum of the cats and exams
  Marks.foreach(m=>println(m.cat1+m.cat2+m.exam))

//Printing The sum of the cats and exams and the names
  Marks.foreach(m=>println(m.name+"\t"+(Integer.valueOf(m.cat1)+Integer.valueOf(m.cat2)+Integer.valueOf(m.exam))))

//Call the grade function which itself call the sum to Printing names and grades
  Marks.foreach(m=>println(m.name+"\t"+grade(sum(Integer.valueOf(m.cat1),Integer.valueOf(m.cat2),Integer.valueOf(m.exam)))))

//Call the grade function which itself call the sum to Printing names and grades
  Marks.foreach(m=>println(m.name+"\t"+sum(Integer.valueOf(m.cat1),Integer.valueOf(m.cat2),Integer.valueOf(m.exam))
    +"\t"+grade(sum(Integer.valueOf(m.cat1),Integer.valueOf(m.cat2),Integer.valueOf(m.exam)))))

  }
}
