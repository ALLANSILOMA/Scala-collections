object Stmarks_list{
  def main(args: Array[String]): Unit = {

    // Case class for student marks
    case class StMarks(name: String, gender: String, cat1: Int, cat2: Int, exam: Int)

    // Function to calculate sum of marks
    def sum(m1: Int, m2: Int, m3: Int): Int = {
      m1 + m2 + m3
    }

    // Function to determine grade based on total marks
    def grade(mark: Int): String = {
      if (mark >= 70) "A"
      else if (mark >= 60) "B"
      else if (mark >= 50) "C"
      else if (mark >= 40) "D"
      else "F"
    }

    // Initializing a List of student marks
    var Marks: List[StMarks] = List(
      StMarks("Faith", "F", 9, 11, 33)
    )

    // Adding more students to the List 
    Marks = Marks ++ List(
      StMarks("Joyce", "F", 5, 18, 35),
      StMarks("John", "M", 7, 8, 28),
      StMarks("Joseph", "M", 8, 12, 38),
      StMarks("Joseph", "M", 8, 12, 38),
      StMarks("David", "M", 10, 10, 40),
      StMarks("Mary", "F", 12, 15, 45),
      StMarks("James", "M", 9, 12, 50),
      StMarks("Elizabeth", "F", 0, 18, 60),
      StMarks("Grace", "F", 9, 10, 33),
      StMarks("Peter", "M", 13, 15, 48),
      StMarks("Susan", "F", 11, 9, 40),
      StMarks("Michael", "M", 17, 19, 50),
      StMarks("George", "M", 5, 6, 25),
      StMarks("Angela", "F", 4, 10, 12),
      StMarks("Matthew", "M", 9, 8, 30),
      StMarks("Rachel", "F", 11, 9, 56)

    )

    // Printing the first item of the list
    println("The first element of the list is:")
    println("Head of Marks List: " + Marks.head)

    // Printing all elements in the list
    println("All elements of the list:")
    Marks.foreach(println)

    // Printing  names of students
    println("The name of the students:")
    Marks.foreach(m => println(m.name))

    // Printing the total marks for each student
    println("Total marks for each student:")
    Marks.foreach(m => println(m.cat1 + m.cat2 + m.exam))

    // Printing name and total marks
    println("Name amd total marks for each student:")
    Marks.foreach(m => println(m.name + "\t" + (m.cat1 + m.cat2 + m.exam)))

    // Printing name and grade for each student
    println("Name and grade for each student:")
    Marks.foreach(m => println(m.name + "\t" + grade(sum(m.cat1, m.cat2, m.exam))))

    // Printing name, total marks, and grade for each student
    println("Name, total marks and grade for each student:")
    Marks.foreach(m => println(m.name + "\t" + sum(m.cat1, m.cat2, m.exam) + "\t" + grade(sum(m.cat1, m.cat2, m.exam))))
  }
}
