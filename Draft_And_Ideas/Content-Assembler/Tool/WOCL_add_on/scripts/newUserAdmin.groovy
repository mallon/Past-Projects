// @ExecutionModes({ON_SINGLE_NODE})

if (node.text == "Website"){
	def user = node.createChild()
	user.text = "User"
	user["userName"] = ""
	user["firstName"]=""
	user["lastName"]=""
	user["nickName"]=""
	user["publicName"]=""
	user["email"]=""
	user["website"]=""
	user["biography"]=""
	user["password"]=""
	
	def role = user.createChild()
	role.text = "Role"

	def admin = role.createChild()
	admin.text = "administrator"
}




