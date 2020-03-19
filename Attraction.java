abstract class Attraction {
    private double price, surfaceArea; //in square meters
    private int timesRidden;
    abstract void ride();

    Attraction(double price, double surfaceArea) {
        setValues(price,surfaceArea);
    }

    private void setValues(double price, double surfaceArea) {
        this.price = price;
        this.surfaceArea = surfaceArea;
    }

    protected void incrementTimesRidden() {
        timesRidden++;
    }

    public double getPrice() {
        return price;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public int getTimesRidden() {
        return timesRidden;
    }
}

interface RiskAttraction {
	void beingChecked();
}


class BumperCars extends Attraction {
	BumperCars() {
	    super(2.50, 21.0);
    }

    void ride() {
        System.out.println("Bumpercars is now active");
        incrementTimesRidden();
    }
}

class Spin extends Attraction implements RiskAttraction {
	Spin() {
		super(2.25, 30.0);
	}
	private int draaiLimiet = 5;
	
	void ride() {
		try {
			specialRide();
		} catch (SpinLimitException s) {
			System.out.println(s);
		}

	}

	void specialRide() throws SpinLimitException {
		if (draaiLimiet > 0) {
			System.out.println("Spin is now active");
			draaiLimiet--;
			incrementTimesRidden();
		} else {
			throw new SpinLimitException();
		}
	}
	
	public void beingChecked() {
			draaiLimiet = 5;
	}
}

class MirrorPalace extends Attraction {
	MirrorPalace() {
		super(2.75, 25.0);
	}
	
	void ride() {
		System.out.println("MirrorPalace is now active");
		incrementTimesRidden();
	}
}

class HauntedMansion extends Attraction {
	HauntedMansion() {
		super(3.20, 28.0);
	}
	
	void ride() {
		System.out.println("HauntedMansion is now active");
		incrementTimesRidden();
	}
}

class Hawaii extends Attraction implements RiskAttraction {
	Hawaii() {
		super(2.90, 10.5);
	}
	private int draaiLimiet = 10;

	void ride() {
		try {
			specialRide();
		} catch (SpinLimitException s) {
			System.out.println(s);
		}

	}

	void specialRide() throws SpinLimitException {
		if (draaiLimiet > 0) {
			System.out.println("Hawaii is now active");
			draaiLimiet--;
			incrementTimesRidden();
		} else {
			throw new SpinLimitException();
		}
	}


	
	public void beingChecked() {
		draaiLimiet = 10;
	}
}

class LadderClimbing extends Attraction {
	LadderClimbing() {
		super(5.00, 6.3);
	}
	
	void ride() {
		System.out.println("HauntedMansion is now active");
		incrementTimesRidden();
	}
}
		
	






