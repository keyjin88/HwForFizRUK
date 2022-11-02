package src.hw3p3;

public class t2 {
    public class BestCarpenterEver {
        public boolean canRepair(Furniture furniture) {
            return furniture instanceof Stool;
        }
    }

    public class Furniture {
    }

    public class Table extends Furniture {
    }

    public class Stool extends Furniture {
    }
}
