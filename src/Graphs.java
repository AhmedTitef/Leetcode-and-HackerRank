import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Graphs {
    int numberOfNodes = 0;
    Hashtable<Integer , ArrayList<Integer>> adjacentList = new Hashtable<>(  );


    void addVertex(int node){

        adjacentList.put( node , new ArrayList<>(  ) );
        numberOfNodes ++;

    }

    void addEdge(int node1 , int node2){

        adjacentList.get( node1 ).add( node2 );  //this reminds me with the chatting app where i had to add each contact enough in each other recent chats pages
        adjacentList.get( node2 ).add( node1 );


    }
    public void showConnections() {
        Object[] keys = adjacentList.keySet().toArray();
        for (Object key : keys) {
            System.out.println(key + " ---> " + adjacentList.get(Integer.parseInt(key.toString())));
        }
    }

    public static void main(String[] args) {
        Graphs graph = new Graphs();
        graph.addVertex(5);
        graph.addVertex(54);
        graph.addVertex(44);
        graph.addEdge(5,54);
        graph.addEdge(5,44);
        graph.showConnections();
    }

}

