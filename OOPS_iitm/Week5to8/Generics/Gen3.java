package OOPS_iitm.Week5to8.Generics;


class RollNumber<T extends Number> {
    private T part1;
    private T part2;

    public RollNumber(T p1, T p2) {
        part1 = p1;
        part2 = p2;
    }

    public T getPart1() {
        return part1;
    }

    public T getPart2() {
        return part2;
    }

    public RollNumber<Integer> genRollno(RollNumber<?> r) { //LINE 1
        RollNumber<Integer> newroll = new RollNumber<>(0, 0);
        newroll.part1 = this.part1.intValue() + r.getPart1().intValue();
        newroll.part2 = this.part2.intValue() + r.getPart2().intValue();
        return newroll;

    }
}

public class Gen3 {
    public static void main(String[] args) {
        RollNumber<Integer> r1 = new RollNumber<>(101, 200);
        RollNumber<Integer> r2 = new RollNumber<>(102, 300);
        RollNumber<Integer> newroll = r1.genRollno(r2);
        System.out.println(newroll.getPart1() + "," + newroll.getPart2());
    }
}