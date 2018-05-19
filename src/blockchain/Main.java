/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.util.ArrayList;

/**
 *
 * @author ahmet
 */
public class Main {
    
    ArrayList<Block> blockchain = new ArrayList<>();
    
    public static void main(String[] args) {
        String[] genesisTransactions = {"satoshi sent 111111 bitcoin to acan","vitalik sent 10 ethereum to acan"};
        Block genesisBlock = new Block(0, genesisTransactions); // ilk block önceki blok olmadigi için ilk hash değer 0 oldu
        
        String[] block2Transactions ={"acan vitaik'e 11 tane ethereum gönderdi","vitalik markete 10 eth gönderdi"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
       
        String[] block3Transactions ={"vitalik satoshi'ye 500 milyon bin trilyon ethereum gönderdi.","acan aqLiyoR"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);
       
        String[] block4Transactions = {"acan 2 milyoasddasdasasddasdasn ethereum satin aldi","vitalik acana 10 milyon yüz bin ethereum gönderdi."};
        Block block4 = new Block(block3.getBlockHash(),block4Transactions);
                
                
                
        System.out.println("genesis(ilk)blogun hash'i:");
        System.out.println(genesisBlock.getBlockHash());
        
        System.out.println("2.blogun hash'i:");
        System.out.println(block2.getBlockHash());
        
        System.out.println("3.blogun hash'i:");
        System.out.println(block3.getBlockHash());
        
        System.out.println("4.blogun hash'i:");
        System.out.println(block4.getBlockHash());
    }
}
