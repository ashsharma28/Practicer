package dev.ashish.ML;

import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

import java.text.DecimalFormat;
import java.util.Enumeration;

/**
 * Created by admin on 20-Dec-16.
 */
public class Classifier {

    public static void main(String[] args) throws Exception {

        ConverterUtils.DataSource source = new ConverterUtils.DataSource("C:\\Users\\admin\\IdeaProjects\\Practice\\src\\dev\\ashish\\ML\\Sample.arff");
        Instances trainingSet = source.getDataSet();
        if (trainingSet.classIndex() == -1)
            trainingSet.setClassIndex(trainingSet.numAttributes() - 1);


        // this is the complexity, here we specify what are our classes,
        // into which we want to classify the data
        ConverterUtils.DataSource source2 = new ConverterUtils.DataSource("C:\\Users\\admin\\IdeaProjects\\Practice\\src\\dev\\ashish\\ML\\TestData.arff");
        Instances testSet = source2.getDataSet();
        if (testSet.classIndex() == -1)
            testSet.setClassIndex(testSet.numAttributes() - 1);


        trainingSet.setClassIndex(5);
        testSet.setClassIndex(5);


        // using the LMT classification algorithm. Many more are available
        NaiveBayes classifier = new NaiveBayes();
        classifier.buildClassifier(trainingSet);


        Evaluation eval = new Evaluation(trainingSet);
        eval.evaluateModel(classifier, testSet);

        System.out.println(eval.toSummaryString());

        // Get the confusion matrix
        double[][] confusionMatrix = eval.confusionMatrix();

        DecimalFormat df = new DecimalFormat("#.##");
        for (Enumeration<Instance> en = testSet.enumerateInstances(); en.hasMoreElements(); ) {
            double[] results = classifier.distributionForInstance(en.nextElement());
            for (double result : results) {
                System.out.print(df.format(result) + " ");
            }
            System.out.println();
        }
        ;
    }

}


