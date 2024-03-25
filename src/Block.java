import java.util.List;
import java.util.LinkedList;
import java.util.Date ;
public class Block {

    private int id ;
    private int nonce ;
    private long timestamp ;
    private String hash ;
    private String previousHash ;
    private String transaction ;
    public Block(int id , String transaction , String previousHash) {
        this.id = id ;
        this.transaction = transaction ;
        this.previousHash = previousHash ;
        this.timestamp = new Date().getTime();
        generateHash();

    }
    public void generateHash() {

        String dataToHash = Integer.toString(id) +
                Long.toString(timestamp) +
                previousHash +
                Integer.toString(nonce) +
                transaction.toString() ;
        this.hash = SHA256Helper.generateHash(dataToHash);

    }
    public void incrementNonce() {
        this.nonce++ ;
    }
    public void setHash(String hash) {
        this.hash = hash ;
    }
    public String getHash() {
        return this.hash;
    }
    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash ;

    }
    public String getPreviousHash() {
        return this.previousHash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "id=" + id +
                ", hash='" + hash + '\'' +
                ", previousHash='" + previousHash + '\'' +
                ", transaction='" + transaction + '\'' +
                '}';
    }
}
