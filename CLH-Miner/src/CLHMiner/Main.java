package CLHMiner;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		String TaxonomyPath = "connectTaxonomy.txt";
		String inputPath = "connect.txt";
		CLH_Miner cl = new CLH_Miner();
		//CLH_MinerTestP cl = new CLH_MinerTestP();
		//pCLH_Miner cl = new pCLH_Miner();
		cl.runAlgorithm((int) 41000000 , inputPath, "", TaxonomyPath);
		
		
		
		cl.printStats();
		
//2088282/2150177
	}
}
