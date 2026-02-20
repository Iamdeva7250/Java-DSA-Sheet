import java.util.*;

class MinHeapNode {
    char data;       // character data
    int freq;        // frequency of the character
    MinHeapNode left, right; // left and right child nodes

    MinHeapNode(char data, int freq) {
        left = right = null;
        this.data = data;
        this.freq = freq;
    }
}

public class HuffmanEncoading {
    // Recursive function to generate Huffman codes
    void getCodes(MinHeapNode root, String str, ArrayList<String> res) {
        if (root == null) return;

        // If this is a leaf node (not the special internal character)
        if (root.data != '$') {
            res.add(str);
        }

        getCodes(root.left, str + "0", res);
        getCodes(root.right, str + "1", res);
    }

    ArrayList<String> huffmanCodes(String S, int[] f, int N) {
        MinHeapNode left, right, top;

        // Min-heap based on frequency
        PriorityQueue<MinHeapNode> minHeap = new PriorityQueue<>(new Comparator<MinHeapNode>() {
            public int compare(MinHeapNode a, MinHeapNode b) {
                return a.freq - b.freq;
            }
        });

        // Add all characters to the heap
        for (int i = 0; i < N; ++i) {
            minHeap.add(new MinHeapNode(S.charAt(i), f[i]));
        }

        // Build Huffman Tree
        while (minHeap.size() > 1) {
            left = minHeap.poll();
            right = minHeap.poll();

            // Internal node with frequency = sum of two smallest
            top = new MinHeapNode('$', left.freq + right.freq);
            top.left = left;
            top.right = right;

            minHeap.add(top);
        }

        // Generate Huffman codes
        ArrayList<String> res = new ArrayList<>();
        getCodes(minHeap.poll(), "", res);

        return res;
    }

    // Example usage
    public static void main(String[] args) {
        HuffmanEncoading sol = new HuffmanEncoading();
        String S = "abcdef";
        int[] freq = {5, 9, 12, 13, 16, 45};
        ArrayList<String> codes = sol.huffmanCodes(S, freq, S.length());

        System.out.println("Huffman Codes:");
        for (String code : codes) {
            System.out.println(code);
        }
    }
}
