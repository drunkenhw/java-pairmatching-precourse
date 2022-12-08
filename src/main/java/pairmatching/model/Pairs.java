package pairmatching.model;

import java.util.List;

public class Pairs {
    private String mission;
    private List<Pair> pairs;

    public Pairs(String mission, List<Pair> pairs) {
        this.mission = mission;
        this.pairs = pairs;
    }

    @Override
    public String toString() {
        return "Pairs{" +
                "mission='" + mission + '\'' +
                ", pair=" + pairs +
                '}';
    }
}