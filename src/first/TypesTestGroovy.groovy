package first

class TypesTestGroovy {

	static void main(def args){
		
		int i=1
		int j = i+3
		int k = i.plus(3)
		assert(k==4)
		
		println i.class
		println j.class
		println k.class
		
		def value = 1.0F
		println value.class
		def value2 = 1
		println value2.class
		// this would be zero in Java
		value2 = value2 / 2
		println value2
		// value was upcasted
		println value2.class
		
		10.times {println "Test"}
		
		for (m in 0..9) {
			println ("Hello $m" )
		}
		assert 'B'..'E' == ['B', 'C', 'D', 'E']
		
	}
	
}
