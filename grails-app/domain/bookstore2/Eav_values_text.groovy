package bookstore2

class Eav_values_text {

    String text_value
	static belongsTo = [eav_attribute:Eav_attribute, eav_item:Eav_item]

	

    static constraints = {
    }

	String ToString(){
	return "EAV Text value ${text_value}"
}
}
