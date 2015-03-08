<?php 
ini_set('include_path', dirname(getcwd()));

function buildFieldUsers($users)
{
    foreach($users as $key => $value) {    
		foreach(get_object_vars($value)as $secKey => $secValue) {
			buildFieldOneUser($secValue);
		}
	}	
}
function buildFieldOneUser($oneUser){
$newUser = array();
$userId = "";
	foreach($oneUser as $key => $value) {
		foreach($value as $secKey => $secValue) {
			switch ($secKey) {	
				case "IdName": 			
					$userId = $secValue;
				break;
				case "UserName": 					
					$newUser['user_login'] = $secValue;
				break;			
				case "Password": 
					$newUser['user_pass'] = $secValue;
				break;
				case "Role": 
					$newUser['role'] = $secValue;
				break;
				case "FirstName": 
					$newUser['first_name'] = $secValue;
				break;
				case "LastName": 
					$newUser['last_name'] = $secValue;
				break;
				case "NickName": 
					$newUser['nickname'] = $secValue;
				break;
				case "PublicName": 
					$newUser['nicename'] = $secValue;
				break;
				case "Email": 
					$newUser['user_email'] = $secValue;
				break;
				case "Website": 
					$newUser['user_url'] = $secValue;
				break;
				case "Biography": 
					$newUser['description'] = $secValue;
				break;
			}
		}	
	}	
	
$userIdBDD = wp_insert_user($newUser);
$GLOBALS['usersCreated'][$userId] = $userIdBDD;
return $usersCreated;
}
?>