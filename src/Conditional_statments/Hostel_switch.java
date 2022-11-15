package Conditional_statments;

public class Hostel_switch {
public static void main(String[] args) {
	switch ("meduvada") {
	case "Dosa":{
		System.out.println("on monday");
		break;
	}
	case "Idali":{
		System.out.println("on tuesday");
		break;
	}
	case "meduvada":{
	System.out.println("on wensaday");
	break;
	}
	case "pizza":{
		System.out.println("on thursday");
		break;
	}
	case "burger":{
		System.out.println("on friday");
		break;
	}
	
	case "Lemon rice":{
		System.out.println("on saturday");
		break;
	}
	default:{
		System.out.println("No breakast");
		break;
	}
}
}
}
