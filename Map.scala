object Stmarks_map {
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

    // Initializing a Map of student marks where key is the student number
    var Marks: Map[Int, StMarks] = Map(
      1 -> StMarks("Faith", "F", 9, 11, 33)
    )

    // Adding more students to the Map
    Marks = Marks ++ Map(
      2 -> StMarks("Joyce", "F", 5, 18, 35),
      3 -> StMarks("John", "M", 7, 8, 28),
      4 -> StMarks("Joseph", "M", 8, 12, 38),
      5 -> StMarks("David", "M", 10, 10, 40),
      6 -> StMarks("Mary", "F", 12, 15, 45),
      7 -> StMarks("James", "M", 9, 12, 50),
      8 -> StMarks("Elizabeth", "F", 0, 18, 60),
      9 -> StMarks("Grace", "F", 9, 10, 33),
      10 -> StMarks("Peter", "M", 13, 15, 48),
      11 -> StMarks("Susan", "F", 11, 9, 40),
      12 -> StMarks("Michael", "M", 17, 19, 50),
      13 -> StMarks("George", "M", 5, 6, 25),
      14 -> StMarks("Angela", "F", 4, 10, 12),
      15 -> StMarks("Matthew", "M", 9, 8, 30),
      16 -> StMarks("Rachel", "F", 11, 9, 56)
    )
    println("\n This is a map!!")

    // Printing the first item of the map
    println("The first element of the map is:")
    println("Head of Marks Map: " + Marks.head)

    // Printing all elements in the map
    println("All elements of the map:")
    Marks.foreach(println)

    // Printing student numbers and names
    println("The student number and names:")
    Marks.foreach { case (num, student) => println(s"Student Number: $num, Name: ${student.name}") }

    // Printing the total marks for each student
    println("Total marks for each student:")
    Marks.foreach { case (_, student) => println(sum(student.cat1, student.cat2, student.exam)) }

    // Printing student number, name, and total marks
    println("Student Number, Name, and Total Marks for each student:")
