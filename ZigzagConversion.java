public class ZigzagConversion {
        public String convert(String s, int numRows) {
            if (numRows == 1 || numRows >= s.length()) {
                return s;
            }
    
            // Create an array of StringBuilder for all rows
            StringBuilder[] rows = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) {
                rows[i] = new StringBuilder();
            }
    
            int currentRow = 0;
            boolean goingDown = false;
    
            // Traverse the string
            for (char c : s.toCharArray()) {
                rows[currentRow].append(c);
    
                // Change direction at the first and last rows
                if (currentRow == 0 || currentRow == numRows - 1) {
                    goingDown = !goingDown;
                }
    
                // Move to the next row
                currentRow += goingDown ? 1 : -1;
            }
    
            // Combine all rows into one string
            StringBuilder result = new StringBuilder();
            for (StringBuilder row : rows) {
                result.append(row);
            }
            return s;
        }
    }
    

