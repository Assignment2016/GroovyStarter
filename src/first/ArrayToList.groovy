package first

class ArrayToList {

	public static void main(args){
		
		def String[] strings = "This is a long sentence".split();
		// convert Array to list
		def List listStrings = strings
		// convert List back to Array
		def String[] arrayStrings = listStrings
		
		println strings.class.name
		println listStrings.class.name
		println arrayStrings.class.name
	
		//Spreaddot operator
		def lists = ["Hello", "Test", "Lars"]
		def sizeList = lists*.size()
		println(sizeList[0]+'--'+sizeList[1])
			
	}
	
}
