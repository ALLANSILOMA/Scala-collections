case class Employee(val FNAME: String, val SNAME: String, val LNAME: String, val SALARY: Double, val
MALLOWANCE: Double, val TALLOWANCE: Double, val DOB: String, val DOE: String) {
| var fname = FNAME
| var sname = SNAME
| var lname = LNAME
| var dob = DOB
| var doe = DOE
| var salary = SALARY
| var mallowance = MALLOWANCE
| var tallowance = TALLOWANCE
|
| def printable() = {
| println("First name: " + fname)
| println("Surname: " + sname)
| println("Last name: " + lname)
| println(s"Salary: " + salary)
| println(s"Medical allowance: " + mallowance)
| println(s"Transport allowance: " + tallowance)
| }
| }
object EmpMonthly {
| def main(args: Array[String]) = {
| def sum(m_allow: Double, t_allow: Double, sal: Double): Double = {
| var g_pay = sal - (m_allow + t_allow)
| return g_pay
| }
|
| val taxPayable = (g_pay: Double) => {
| if (0 <= g_pay <= 20000) g_pay * 0
| else if (20000 < g_pay <= 30000) g_pay * 0.1
| else if (30000 < g_pay <= 40000) g_pay * 0.2
| else if (40000 < g_pay <= 50000) g_pay * 0.3
| else g_pay * 0.4
| }
|
| val emp = ArrayBuffer[Int](10)
| val nhif: Int = 1300
| val nssf: Int = 2000
println(“Enter first name: “)
val f_name = scala.io.StdIn.readLine()
println(“Enter surname: “)
val s_name = scala.io.StdIn.readLine()
println(“Enter last name: “)
val l_name = scala.io.StdIn.readLine()
println(“Enter salary: “)
val salary = scala.io.StdIn.readLine()
println(“Enter medical allowance: “)
val mallow = scala.io.StdIn.readLine()
println(“Enter transport allowance: “)
val tallow = scala.io.StdIn.readLine()
val tincome = g_pay – (nhif + nssf)

val paye = taxPayable(g_pay)
val net_pay = tincome – paye
val gpay = sum(mallow, tallow, sala)
val empl = new Employee(f_name, s_name, l_name, sala, mallow, tallow)
empl.printable()
println(“The gross pay: “ + gpay)
println(“The total income: “ + tincome)
println(“The PAYE: “ + paye)
println(“The net pay: “ + net_pay)