package bookstore2

class Eav_values_int {

	Integer int_value

	static belongsTo = [eav_attribute:Eav_attribute, eav_item:Eav_item]

    static constraints = {
    }


	String ToString(){
	return "EAV Integer value ${int_value}"
}

}
