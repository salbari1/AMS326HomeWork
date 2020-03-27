import java.util.Arrays;
import java.util.Random;

/* SourceCode for functions multiplyMatrix and multiplyMatrixCell https://www.baeldung.com/java-matrix-multiplication */ 

public class Hw2 {
	 
	private static double UniRandom(double min, double max) {
		double result = Math.random() * (max - min) + min;
		return result;
	}
	
	static double[][] multiplyMatrix(double[][] firstMatrix, double[][] secondMatrix) {
	    double[][] result = new double[firstMatrix.length][secondMatrix[0].length];
	 
	    for (int row = 0; row < result.length; row++) {
	        for (int col = 0; col < result[row].length; col++) {
	            result[row][col] = multiplyMatrixCell(firstMatrix, secondMatrix, row, col);
	        }
	    }
	 
	    return result;
	}
	static double multiplyMatrixCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
	    double cell = 0;
	    for (int i = 0; i < secondMatrix.length; i++) {
	        cell += firstMatrix[row][i] * secondMatrix[i][col];
	    }
	    return cell;
	}

	public static void main(String[] args) {
		
		
	    double[][] matrix3 = new double[(int) Math.pow(2,12)][(int) Math.pow(2,12)];

	    for (int i1 = 0; i1 < 4096; i1++) {
	        for (int j = 0; j < 4096; j++) {
	        	matrix3[i1][j] = UniRandom(-1,1);
	        }
	    }
	    double[][] matrix4 = new double[(int) Math.pow(2,12)][(int) Math.pow(2,12)];

	    for (int i1 = 0; i1 < 4096; i1++) {
	        for (int j = 0; j < 4096; j++) {
	        	matrix4[i1][j] = UniRandom(-1,1);
	        }
	    }
	    double[][] actual2 = multiplyMatrix(matrix3, matrix4);
	    
	    for (int i1 = 0; i1 < actual2.length; i1++) {
	        for (int j = 0; j < actual2[i1].length; j++) {
	            System.out.print(actual2[i1][j] + " ");
	        }
	    }
	        
	        
	   
	    }
	}


