package bookstore2

class Eav_attribute {

	String attr_name

    static belongsTo = [eav_attr_group:Eav_attr_group]

    static constraints = {
    }
	String toString(){
	return "${attr_name}"
}


}
