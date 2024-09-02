def count_word_in_file(filename):
    try:
        with open(filename, 'r') as file:
            text = file.read()
            words = text.split()
            num_words = len(words)
        return num_words
    except FileNotFoundError:
        return "File not Found"
    
filename = 'C:/123B1F004/a.txt'
word_count = count_word_in_file(filename)
print(f"Number of words in '{filename}' : {word_count}")
