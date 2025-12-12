package lt.ng.model;

import java.util.List;

public class ArcheryCalculator {
    private Coordinate center;
    private double smallRadius;
    private double mediumRadius;
    private double bigRadius;
    private double smallPointValue;
    private double mediumPointValue;
    private double bigPointValue;
    private List<Coordinate> shots;
    private double totalPoints;

    public ArcheryCalculator(
            Coordinate center,
            double smallRadius,
            double mediumRadius,
            double bigRadius,
            double smallPointValue,
            double mediumPointValue,
            double bigPointValue
    ) {
        this.center = center;
        this.smallRadius = smallRadius;
        this.mediumRadius = mediumRadius;
        this.bigRadius = bigRadius;
        this.smallPointValue = smallPointValue;
        this.mediumPointValue = mediumPointValue;
        this.bigPointValue = bigPointValue;
    }

    public void addShots(List<Coordinate> coordinates) {
        shots = coordinates;
    }

    public void calculatePoints() {
        for (Coordinate shot : shots) {
            double distance = getDistance(center.x, shot.x, center.y, shot.y);
            totalPoints += getPoints(distance);
        }
    }

    private double getDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private double getPoints(double distance) {
        if (distance <= smallRadius) {
            if (distance == smallRadius) {
                return smallPointValue / 2;
            }
            return smallPointValue;
        } else if (distance <= mediumRadius && distance > smallRadius) {
            if (distance == mediumRadius) {
                return mediumPointValue / 2;
            }
            return mediumPointValue;
        } else if (distance <= bigRadius && distance > mediumRadius) {
            if (distance == bigRadius) {
                return bigPointValue / 2;
            }
            return bigPointValue;
        } else {
            return 0.0;
        }
    }

    public String getResults() {
        return String.format("Target's center is at %s. Rings radius are %.1f, %.1f and %.1f. " +
                        "You get %.1f for shot in big ring, %.1f for shot in medium ring and %.1f for shot in small ring. " +
                        "Made shots: %s. Total points: %.1f",
                center,
                bigRadius,
                mediumRadius,
                smallRadius,
                bigPointValue,
                mediumPointValue,
                smallPointValue,
                shots,
                totalPoints);
    }

    public record Coordinate(double x, double y) {
        @Override
        public String toString() {
            return String.format("(%.1f, %.1f)", x, y);
        }
    }
}
