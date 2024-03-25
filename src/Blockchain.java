import java.util.LinkedList;
import java.util.List ;
public class Blockchain {

    List<Block> blockchain ;

    public Blockchain() {

        blockchain = new LinkedList<>();

    }
    public void addBlock(Block block) {
        blockchain.add(block);
    }
    public List<Block> getBlockchain() {
        return this.blockchain ;
    }
    public int getBlockchainSize() {
        return this.blockchain.size();
    }

    @Override
    public String toString() {
        String s = "";
        for(Block block: this.blockchain)
            s += block.toString() + "\n";
        return s ;

    }
}
