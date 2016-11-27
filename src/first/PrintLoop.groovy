package first

class PrintLoop {
	public static void main(def args){
		
		def list = ["AAA", "BBB", "CCC"]
		// using a variable assignment
		list.each{firstName->
		  println firstName
		}
		// using the it variable
		list.each{println it}
		
		5.times {println "Times + $it "}
		1.upto(3) {println "Up + $it "}
		4.downto(1) {print "Down + $it "}
		def sum = 0
		1.upto(100) {sum += it}
		print sum
		(1..6).each {print "Range $it"}

		
		
}
	
	
	

}
