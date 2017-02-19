package edu.ashish.SC;

/**
 * Created by admin on 09-Feb-17.
 */
public class NeuralNet {

    public static void main(String[] args) {
        /*double[][] input = {{4.5,3.5,1.32,2.3}};
        double[][] weights = {{2},{3},{2},{2}};
        */
        NeuralNet neuralNet = new NeuralNet();
        double[] input = {1, 0, 1, 0, 0, 0};


        double[] layer1 = new double[1000];
        int i = 0;
        for (double v : input) {
            int x = neuralNet.neuralNode(new double[]{v}, new double[]{-1}, 0);
            layer1[i] = x;
            i++;
        }
        System.out.println();

        neuralNet.neuralNodeSameWeight(layer1, -1, 0);
    }

    int neuralNode(double[] inputs, double[] weight, int threshold) {

        if (inputs.length != weight.length) return -1;

        double x = 0;
        for (int i = 0; i < inputs.length; i++) {
            x = x + (inputs[i] * weight[i]);
            System.out.println(inputs[i] + " - " + weight[i]);
        }

        if (x >= threshold) return 1;
        else return 0;

    }

    int neuralNodeSameWeight(double[] inputs, double weight, int threshold) {

        double x = 0;
        for (int i = 0; i < inputs.length; i++) {
            x = x + (inputs[i] * weight);
        }

        if (x >= threshold) return 1;
        else return 0;

    }
}
