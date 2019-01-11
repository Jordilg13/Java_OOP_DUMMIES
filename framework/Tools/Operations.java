package OOP.framework.Tools;

public class Operations {
	public static float sum() {

		float num1 = Inputs.validafloat("First number", "Sum");
		float num2 = Inputs.validafloat("First number", "Sum");
		return (num1 + num2);
	}// sum

	public static float diff() {
		float num1 = Inputs.validafloat("First number", "Difference");
		float num2 = Inputs.validafloat("First number", "Difference");
		return (num1 - num2);
	}

	public static float prod() {
		float num1 = Inputs.valida0("prod", Inputs.validafloat("First number", "Product"));
		float num2 = Inputs.valida0("prod", Inputs.validafloat("Second number", "Product"));

		return (num1 * num2);
	}

	public static float div() {
		
			float num1 = Inputs.valida0("div", 0);
			float num2 = Inputs.valida0("div", 0);
			
		return (num1 / num2);
	}

}
