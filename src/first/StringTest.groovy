package first

class StringTest {

	static void main(def args){
	def name = "John"
	def s1 = "Hello $name" // $name will be replaced
	def s2 = 'Hello $name' // $name will not be replaced
	println s1
	println s2
	println s1.class
	println s2.class
	}
	
	
}
