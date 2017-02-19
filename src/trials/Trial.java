package trials;


public class Trial {
/*\    public static void main(String[] args) {

        String[] s = new String[]{" Propositional and first order logic. Sets, relations, functions, partial\n" +
                "orders and lattices. Groups. Graphs: connectivity, matching, coloring. Combinatorics:\n" +
                "counting, recurrence relations, generating functions"

                , "Matrices, determinants, system of linear equations, eigenvalues and\n" +
                "eigenvectors, LU decomposition."

                , "Limits, continuity and differentiability. Maxima and minima. Mean value\n" +
                "theorem. Integration"

                , "Random variables. Uniform, normal, exponential, poisson and binomial\n" +
                "distributions. Mean, median, mode and standard deviation. Conditional probability and\n" +
                "Bayes theorem"

                , "Boolean algebra. Combinational and sequential circuits. Minimization. Number\n" +
                "representations and computer arithmetic (fixed and floating point)."

                , "Machine instructions and addressing modes. ALU, data-path and control unit. Instruction\n" +
                "pipelining. Memory hierarchy: cache, main memory and secondary storage, I/O\n" +
                "interface (interrupt and DMA mode). "

                , "Programming in C. Recursion. Arrays, stacks, queues, linked lists, trees, binary search\n" +
                "trees, binary heaps, graphs.",

                "Searching, sorting, hashing. Asymptotic worst case time and space complexity.\n" +
                        "Algorithm design techniques: greedy, dynamic programming and divide-and-conquer.\n" +
                        "Graph search, minimum spanning trees, shortest paths"

                , "Regular expressions and finite automata. Context-free grammars and push-down\n" +
                "automata. Regular and contex-free languages, pumping lemma. Turing machines and\n" +
                "undecidability"

                , "Lexical analysis, parsing, syntax-directed translation. Runtime environments. Intermediate\n" +
                "code generation. ",

                "Processes, threads, inter-process communication, concurrency and synchronization.\n" +
                        "Deadlock. CPU scheduling. Memory management and virtual memory. File systems",

                "ER-model. Relational model: relational algebra, tuple calculus, SQL. Integrity constraints,\n" +
                        "normal forms. File organization, indexing (B and B+ trees). Transactions and\n" +
                        "concurrency control.",
                "Concept of layering. LAN technologies (Ethernet). Flow and error control techniques,\n" +
                        "switching. IPv4/IPv6, routers and routing algorithms (distance vector, link state). TCP/UDP\n" +
                        "and sockets, congestion control. Application layer protocols (DNS, SMTP, POP, FTP, HTTP).\n" +
                        "Basics of Wi-Fi. Network security: authentication, basics of public key and private key\n" +
                        "cryptography, digital signatures and certificates, firewalls"

        };


        String[] subjects = new String[]{
                "Discrete Mathematics",
                "Linear Algebra",
                "Calculus",
                "Probability",
                "Digital Logic",
                "Computer Organization and Architecture",
                "Programming and Data Structures ",
                "Algorithms",
                "Theory of Computation",
                "Compiler Design",
                "Operating System",
                "Databases",
                "Computer Networks"
        };


        //////////////////////////////////////////////////////////////////////////////////////////
        //////////MAKING THE HASH MAP (Digitizing and preprocessing the raw input/////////////////
        //////////////////////////////////////////////////////////////////////////////////////////

        List<String> arrayList = Arrays.asList(s);
        List<String> subjectsList = Arrays.asList(subjects);

        LinkedHashMap<String, String[]> stringLinkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {

            String[] split = arrayList.get(i).replaceAll("[\n]", " ").replaceAll("[:()]", ",").trim().split("[.,]");
            stringLinkedHashMap.put(subjectsList.get(i), split);
        }


        Connection con;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "", "");


            int sId = 1;
            int tId = 0;
            for (Iterator<String> iterator = stringLinkedHashMap.keySet().iterator(); iterator.hasNext(); ) {
                String s1 = iterator.next();
                System.out.print(s1 + " -- ");
                sId++;

                String[] strings = stringLinkedHashMap.get(s1);

                for (String string : strings) {

                    tId++;
                    PreparedStatement statement = con.prepareStatement("INSERT INTO topics (Topics) VALUES ( ?);");
                    statement.setString(1, string);
                    statement.execute();


                    PreparedStatement statement2 = con.prepareStatement("INSERT INTO mappings (tId, sid)  VALUES (? , ?);");
                    statement2.setInt(1, tId);
                    statement2.setInt(2, sId);
                    statement2.execute();

                    //System.out.println(tId +" -- "+ sId);


                }

                System.out.println();

            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/


    public static void main(String[] args) {
        System.out.println("1001 AND 1111 = 1001");
        System.out.println("1001 OR 1111 = 1111");
        System.out.println("1001 NAND 1111 = 110");
        System.out.println("1001 NOR 1111 = 0000");
        System.out.println("1001 XOR 1111 = 110");
    }
}

