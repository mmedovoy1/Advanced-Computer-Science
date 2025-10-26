public class NameOps {
    public static String printMethodCall(String method, String name) {
        return (method + "(\"" + name + "\"): ");
    }

    public static String whoIsAwesome(String name) {
        return (name + " is awesome!");
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        int firstspace = indexOfFirstSpace(name);
        if (firstspace > 0) {
            String restname = name.substring(firstspace+1);
            if (indexOfFirstSpace(restname) > 0) {
                 return (firstspace + indexOfFirstSpace(restname)+1);
            } else { 
                return -1;
            }
        } else {
            return firstspace;
        }

    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) > 0) {
            return name.substring(0, indexOfFirstSpace(name));
        } else {
            return name;
        }
    }

    public static String findLastName(String name) {
        if (indexOfFirstSpace(name) > 0) {
            if (indexOfSecondSpace(name) > 0) {
                return name.substring(indexOfSecondSpace(name) + 1);
            } else if (indexOfSecondSpace(name) == -1) {
                return name.substring(indexOfFirstSpace(name) + 1);
            }
        } 
        return "";
    }

    public static String findMiddleName(String name) {
        if (indexOfFirstSpace(name) > 0 && indexOfSecondSpace(name) > 0) {
            return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name));
        }
        return "";
    }

    public static String generateLastFirstMidInitial(String name) {
        String last = findLastName(name);
        String first = findFirstName(name);
        String midIn = "";
        if (findMiddleName(name).compareTo(" ") != 0) {
            midIn = midIn + findMiddleName(name).charAt(1);
        }
        if (indexOfSecondSpace(name) == -1) {
            return ()
        }
        if (indexOfFirstSpace(name) == -1) {
            return name;
        }
  
        return (last + ", " + first + " " + midIn);
    }
}