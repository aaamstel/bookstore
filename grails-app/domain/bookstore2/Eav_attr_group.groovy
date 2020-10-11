package bookstore2

class Eav_attr_group {

	String attr_group_name

	static belongsTo = [eav_groups:Eav_group]
	static hasMany = [eav_attribute:Eav_attribute]

    static constraints = {
    }
	String toString(){
	return "EAV Group name ${attr_group_name}"
}
	
}
