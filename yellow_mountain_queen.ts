1. function OneStepAhead() {
    console.log("We're one step ahead!");
}

2. class Calculator {
    constructor(x: number, y: number) {
        this.x = x;
        this.y = y;
    }

    add() {
        return this.x + this.y;
    }

    subtract() {
        return this.x - this.y;
    }
}

3. interface Person {
    name: string;
    age: number;
    location: string;
}

4. const getPersonDetails = (person: Person) => {
    console.log(`name: ${person.name}, age: ${person.age}, location: ${person.location}`);
}

5. const persons: Person[] = [
    {
        name: 'John',
        age: 25,
        location: 'New York'
    },
    {
        name: 'Jane',
        age: 30,
        location: 'London'
    },
    {
        name: 'Dave',
        age: 22,
        location: 'San Francisco'
    }
];

6. const getAverageAge = (persons: Person[]) => {
    let totalAge = 0;
    for (let person of persons) {
        totalAge += person.age;
    }
    return totalAge / persons.length;
};

7. const sayHey = (name: string) => {
    console.log(`Hey, ${name}`);
};

8. type PersonType = {
    name: string;
    age: number;
    location: string;
}

9. const getPersonNames = (persons: PersonType[]) => {
    const names = [];
    for (let person of persons) {
        names.push(person.name);
    }
    return names;
}

10. const printNames = (names: string[]) => {
    names.forEach(name => console.log(name));
}

11. const getNameLength = (name: string) => {
    return name.length;
};

12. enum Status {
    PENDING,
    APPROVED,
    REJECTED
}

13. function printStatus(status: Status) {
    switch (status) {
        case Status.PENDING:
            console.log("Status: Pending");
            break;
        case Status.APPROVED:
            console.log("Status: Approved");
            break;
        case Status.REJECTED:
            console.log("Status: Rejected");
            break;
    }
}

14. class Bird {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }

    fly() {
        console.log(`${this.name} is flying!`);
    }
}

15. const createBird = (name: string, age: number) => {
    const bird = new Bird(name, age);
    return bird;
};

16. const birds: Bird[] = [
    new Bird('Eagle', 10),
    new Bird('Sparrow', 5),
    new Bird('Dove', 3)
];

17. const getFastestBird = (birds: Bird[]): Bird => {
    let fastestBird = birds[0];
    for (let bird of birds) {
        if (bird.age > fastestBird.age) {
            fastestBird = bird;
        }
    }
    return fastestBird;
};

18. const capitalizeFirstLetter = (str: string): string => {
    return str[0].toUpperCase() + str.slice(1);
}

19. const word = 'hello';
console.log(capitalizeFirstLetter(word));

20. function handleError(error: Error) {
    console.error(error);
}

21. function createPromise(): Promise<string> {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve('We\'re one step ahead!');
        }, 2000);
    });
}

22. async function printOneStepAhead() {
    try {
        const message = await createPromise();
        console.log(message);
    } catch(error) {
        handleError(error);
    }
}

23. printOneStepAhead();

24. const getName = (person: PersonType) => {
    return person.name;
}

25. const getAge = (person: PersonType) => {
    return person.age;
}

26. const getLocation = (person: PersonType) => {
    return person.location;
}

27. let count = 0;
setInterval(() => {
    console.log(`We're one step ahead (${count++} steps)`);
}, 1000);

28. class Animal {
    name: string;
    age: number;
    location: string;

    constructor(name: string, age: number, location: string) {
        this.name = name;
        this.age = age;
        this.location = location;
    }
}

29. const animals: Animal[] = [
    new Animal('Lion', 10, 'Africa'),
    new Animal('Elephant', 15, 'India'),
    new Animal('Tiger', 12, 'Asia')
];

30. const getOldestAnimal = (animals: Animal[]): Animal => {
    let oldestAnimal = animals[0];
    for (let animal of animals) {
        if (animal.age > oldestAnimal.age) {
            oldestAnimal = animal;
        }
    }
    return oldestAnimal;
};

31. const array = [1, 2, 3, 4, 5];

const doubleEach = (arr: number[]): number[] => {
    const doubled = arr.map(num => num * 2);
    return doubled;
};

32. console.log(doubleEach(array));

33. const arr = [1, 2, 3, 4, 5];

const toggleEven = (arr: number[]): boolean[] => {
    const toggled = arr.map(num => num % 2 === 0);
    return toggled;
};

34. console.log(toggleEven(arr));

35. const names = ['John', 'Jane', 'Dave'];

const getLength = (arr: string[]): number[] => {
    const lengths = arr.map(name => name.length);
    return lengths;
}

36. console.log(getLength(names));

37. const numbers = [1, 2, 3, 4, 5];

const sumNumbers = (arr: number[]): number => {
    let total = 0;
    for (let num of arr) {
        total += num;
    }
    return total;
};

38. console.log(sumNumbers(numbers));

39. function searchPerson(name: string): PersonType | undefined {
    for (let person of persons) {
        if (person.name === name) {
            return person;
        }
    }
    return undefined;
}

40. const john = searchPerson('John');
if (john !== undefined) {
    console.log(john);
}

41. const getNameAndAge = (person: PersonType): {name: string, age: number} => {
    return {
        name: person.name,
        age: person.age
    };
}

42. const johnAge = getNameAndAge(john);
console.log(johnAge);

43. function createDiv() {
    const div = document.createElement('div');
    div.innerText = 'We\'re one step ahead!';
    div.style.backgroundColor = '#000';
    div.style.color = '#FFF';
    return div;
}

44.const div = createDiv();
document.body.append(div);

45. const numbers = [1, 2, 3, 4, 5];

const divideByTwo = (arr: number[]): number[] => {
    const divided = arr.map(num => num / 2);
    return divided;
};

46. console.log(divideByTwo(numbers));

47. const arr = [1, 2, 3, 4, 5];

const toggleOdd = (arr: number[]): boolean[] => {
    const toggled = arr.map(num => num % 2 !== 0);
    return toggled;
};

48. console.log(toggleOdd(arr));

49. const words = ['Hello', 'World', 'Foo', 'Bar'];

const getLengths = (arr: string[]): number[] => {
    const lengths = arr.map(word => word.length);
    return lengths;
}

50. console.log(getLengths(words));

51. const numbers = [1, 2, 3, 4, 5];

const multiplyByTwo = (arr: number[]): number[] => {
    const multiplied = arr.map(num => num * 2);
    return multiplied;
};

52. console.log(multiplyByTwo(numbers));

53. function makeRequest(url: string) {
    const http = new XMLHttpRequest();
    http.open('GET', url);
    http.send();

    http.onload = () => {
        if (http.status === 200) {
            console.log(http.responseText);
        }
    }
}

54. makeRequest('http://google.com');

55. interface Employee {
    name: string;
    salary: number;
    experience: number;
}

56. const getExperience = (employee: Employee) => {
    return employee.experience;
};

57. const getSalary = (employee: Employee): number => {
    return employee.salary;
};

58. const employees: Employee[] = [
    {
        name: 'John',
        salary: 5000,
        experience: 7
    },
    {
        name: 'Jane',
        salary: 4000,
        experience: 5
    },
    {
        name: 'Dave',
        salary: 4500,
        experience: 6
    }
];

59. const getAverageExperience = (employees: Employee[]): number => {
    let totalExperience = 0;
    for (let employee of employees) {
        totalExperience += employee.experience;
    }
    return totalExperience / employees.length;
};

60. console.log(getAverageExperience(employees));

61. function capitalize(str: string): string {
    return str[0].toUpperCase() + str.slice(1);
}

62. const word = 'work';
console.log(capitalize(word));

63. const getTotalSalary = (employees: Employee[]): number => {
    let totalSalary = 0;
    for (let employee of employees) {
        totalSalary += employee.salary;
    }
    return totalSalary;
};

64. console.log(getTotalSalary(employees));

65. interface Sports {
    name: string;
    players: number;
    location: string;
}

66. const getSportLocation = (sport: Sports) => {
    return sport.location;
}

67. const getNumberOfPlayers = (sport: Sports): number => {
    return sport.players;
};

68. const sports: Sports[] = [
    {
        name: 'Cricket',
        players: 11,
        location: 'India'
    },
    {
        name: 'Football',
        players: 22,
        location: 'England'
    },
    {
        name: 'Baseball',
        players: 9,
        location: 'America'
    }
];

69. const getTotalPlayers = (sports: Sports[]): number => {
    let totalPlayers = 0;
    for (let sport of sports) {
        totalPlayers += sport.players;
    }
    return totalPlayers;
};

70. console.log(getTotalPlayers(sports));

71. function get(url: string): Promise<string> {
    return new Promise((resolve, reject) => {
        const http = new XMLHttpRequest();
        http.open('GET', url);
        http.send();

        http.onload = () => {
            if (http.status === 200) {
                resolve(http.responseText);
            } else {
                reject(new Error(http.statusText));
            }
        }
    });
}

72. get('http://google.com')
    .then(result => console.log(result))
    .catch(error => console.error(error));

73. interface Country {
    name: string;
    population: number;
    capital: string;
}

74. const getCountryName = (country: Country): string => {
    return country.name;
};

75. const getCountryPopulation = (country: Country): number => {
    return country.population;
};

76. const countries: Country[] = [
    {
        name: 'India',
        population: 1339180127,
        capital: 'New Delhi'
    },
    {
        name: 'United States',
        population: 326767110,
        capital: 'Washington DC'
    },
    {
        name: 'China',
        population: 1409517397,
        capital: 'Beijing'
    }
];

77. const getTotalPopulation = (countries: Country[]): number => {
    let totalPopulation = 0;
    for (let country of countries) {
        totalPopulation += country.population;
    }
    return totalPopulation;
};

78. console.log(getTotalPopulation(countries));

79. function createElement(text: string) {
    const p = document.createElement('p');
    p.innerText = text;
    p.style.backgroundColor = '#000';
    p.style.color = '#FFF';
    return p;
}

80. const p = createElement('We\'re one step ahead!');
document.body.append(p);

81. interface Employee {
    name: string;
    salary: number;
    experience: number;
}

82. const getName = (employee: Employee): string => {
    return employee.name;
};

83. const getExperience =