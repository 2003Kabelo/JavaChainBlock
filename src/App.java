public class App {
    public static void main(String[]args) {

       Blockchain blockchain =new Blockchain();
       Miner miner = new Miner();
       Block block0 = new Block(0,"",Constants.GENESIS_PREVIOUS_HASH);
       miner.mine(block0,blockchain);
       Block block1 = new Block(1,"transaction1",blockchain.getBlockchain().get(blockchain.getBlockchainSize()-1).getHash());
       miner.mine(block1,blockchain);
       Block block2 = new Block(2,"transaction2",blockchain.getBlockchain().get(blockchain.getBlockchainSize()-1).getHash());
       miner.mine(block2,blockchain);
       System.out.println("\n"+ "Blockchain" + "\n" + blockchain);
       System.out.println("Mine's Reward : " + miner.getReward());


    }
}
