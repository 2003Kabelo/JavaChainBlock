public class Miner {

    public double reward ;
    public void mine(Block block , Blockchain blockchain) {

        while(!(isGoldenHash(block))) {
            block.incrementNonce();
            block.generateHash();
        }
        System.out.println(block + "........Has just mined.........");
        System.out.println("The has of the block mined is : "+ block.getHash());
        blockchain.addBlock(block);
        reward += Constants.REWARD ;

    }
    public boolean isGoldenHash(Block block) {
        String leadingzeroes = new String(new char[Integer.parseInt(Constants.DIFFICULTY)]).replace('\0','0');
        return block.getHash().substring(0, Integer.parseInt(Constants.DIFFICULTY)).equals(leadingzeroes);

    }
    public double getReward() {
        return this.reward;
    }

}
