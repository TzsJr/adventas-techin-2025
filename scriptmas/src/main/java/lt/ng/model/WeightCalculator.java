package lt.ng.model;

import java.util.List;

import static java.math.RoundingMode.HALF_UP;
import static lt.ng.util.NumberUtils.roundWithPrecision;

public class WeightCalculator {
    private final List<Double> weightsOfMelons;
    private double averageWeight;
    private int numberOfPerfectMelon;
    private double weightOfPerfectMelon;

    public WeightCalculator(List<Double> weightsOfMelons) {
        this.weightsOfMelons = weightsOfMelons;
    }

    public void calculateAverageWeight() {
        int totalMelons = weightsOfMelons.size();
        double totalWeight = 0;

        for (double melonWeight : weightsOfMelons) {
            totalWeight += melonWeight;
        }

        averageWeight = roundWithPrecision(totalWeight / totalMelons, 2, HALF_UP);
    }

    public void calculatePerfectMelonNumber() {
        // We start with thought that first melon is closest to average
        double firstMelonWeight = weightsOfMelons.getFirst();
        double lowestDiff = Math.abs(averageWeight - firstMelonWeight);
        numberOfPerfectMelon = 1;
        weightOfPerfectMelon = firstMelonWeight;

        // Start skipping first melon as it's already taken as closest and there is no need to compare again
        for (int i = 1; i < weightsOfMelons.size(); i++) {
            double melonWeight = weightsOfMelons.get(i);
            double currentDiff = Math.abs(averageWeight - melonWeight);
            if (currentDiff < lowestDiff) {
                lowestDiff = currentDiff;
                // Index starts from 0, but we need number which is 'index + 1'
                numberOfPerfectMelon = i + 1;
                weightOfPerfectMelon = melonWeight;
            }
        }
    }

    public String getResults() {
        return String.format("""
                        Melons weight: %s. Average weight of %d melons is %.2f. Perfect is %d melon with weight %.2f.
                        
                        melonNumber averageWeight
                        %d %.2f
                        """,
                weightsOfMelons,
                weightsOfMelons.size(),
                averageWeight,
                numberOfPerfectMelon,
                weightOfPerfectMelon,
                numberOfPerfectMelon,
                weightOfPerfectMelon);
    }
}
