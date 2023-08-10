public class ContactBook
{
    static List<Contact> contacts = new List<Contact>();

    public void StartGame()
    {
        Output();
    }
    static void Output()
    {
        Console.WriteLine("Welcome to the Contact Book!\n");
        int choice;
        do
        {
            DisplayMenu();
            choice = GetUserChoice();

            switch (choice)
            {
                case 1:
                    AddContact();
                    break;
                case 2:
                    ViewAllContacts();
                    break;
                case 3:
                    SearchContacts();
                    break;
                case 4:
                    UpdateContact();
                    break;
                case 5:
                    DeleteContact();
                    break;
                case 6:
                    Console.WriteLine("Goodbye!");
                    break;
                default:
                    Console.WriteLine("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);
    }

    static void DisplayMenu()
    {
        Console.WriteLine("1. Add a new contact");
        Console.WriteLine("2. View all contacts");
        Console.WriteLine("3. Search contacts");
        Console.WriteLine("4. Update a contact");
        Console.WriteLine("5. Delete a contact");
        Console.WriteLine("6. Exit");
    }

    static int GetUserChoice()
    {
        int choice;
        bool isValid = false;

        do
        {
            Console.WriteLine("\nEnter your choice: ");
            isValid = int.TryParse(Console.ReadLine(), out choice);
            if (!isValid)
            {
                Console.WriteLine("Invalid input, enter numbers between 1 - 6 only!");
            }
        } while (!isValid);
        return choice;
    }

    static void AddContact()
    {
        string name = "";
        while (string.IsNullOrEmpty(name) || !name.All(char.IsLetter))
        {
            Console.Write("\nEnter contact name: ");
            name = Console.ReadLine();

            if (!name.All(char.IsLetter))
            {
                Console.WriteLine("\nInvalid input, enter letters only!");
            }
        }

        int phoneNumber;
        Console.Write("Enter phone number: ");
        while (!int.TryParse(Console.ReadLine(), out phoneNumber))
        {
            Console.WriteLine("Invalid Input, enter numbers only!");
        }

        Console.Write("Enter email address: ");
        string email = Console.ReadLine();

        contacts.Add(new Contact { Name = name, PhoneNumber = phoneNumber, Email = email });
        Console.WriteLine("\nContact added successfully!\n");
    }

    static void ViewAllContacts()
    {
        Console.WriteLine("\nContacts:");

        for (int i = 0; i < contacts.Count; i++)
        {
            Console.WriteLine($"{i + 1}. {contacts[i].Name} - {contacts[i].PhoneNumber} - {contacts[i].Email}\n");
        }
    }

    static void SearchContacts()
    {
        Console.Write("\nEnter search query: ");
        string query = Console.ReadLine().ToLower();

        List<Contact> searchResults = contacts.FindAll(c => c.Name.ToLower().Contains(query));

        Console.WriteLine("\nResults:");
        foreach (var contact in searchResults)
        {
            Console.WriteLine($"{contact.Name} - {contact.PhoneNumber} - {contact.Email}\n");
        }        
    }

    static void UpdateContact()
    {
        Console.Write("Enter contact name to update: ");
        string nameToUpdate = Console.ReadLine();

        Contact contactToUpdate = contacts.Find(c => c.Name.Equals(nameToUpdate, StringComparison.OrdinalIgnoreCase));
        if (contactToUpdate == null)
        {
            Console.WriteLine("\nContact not found.\n");
        }

        string newName = "";
        while (string.IsNullOrEmpty(newName) || !newName.All(char.IsLetter))
        {
            Console.Write("\nEnter new name: ");
            newName = Console.ReadLine();

            if (!newName.All(char.IsLetter))
            {
                Console.WriteLine("\nInvalid input, enter letters only");
            }
        }

        int newPhoneNumber;
        Console.Write("Enter new phone number: ");
        while (!int.TryParse(Console.ReadLine(), out newPhoneNumber))
        {
            Console.WriteLine("Invalid input, enter numbers only!");
        }

        Console.Write("Enter new email address: ");
        string newEmail = Console.ReadLine();

        contactToUpdate.Name = newName;
        contactToUpdate.PhoneNumber = newPhoneNumber;
        contactToUpdate.Email = newEmail;

        Console.WriteLine("\nContact updated successfully!\n");
    }

    static void DeleteContact()
    {
        Console.Write("Enter contact name to delete: ");
        string nameToDelete = Console.ReadLine();
        Contact contactToDelete = contacts.Find(c => c.Name.Equals(nameToDelete, StringComparison.OrdinalIgnoreCase));
        if (contactToDelete == null)
        {
            Console.WriteLine("\nContact not found.\n");
            return;
        }
        contacts.Remove(contactToDelete);
        Console.WriteLine("\nContact deleted successfully!\n");
    }
}