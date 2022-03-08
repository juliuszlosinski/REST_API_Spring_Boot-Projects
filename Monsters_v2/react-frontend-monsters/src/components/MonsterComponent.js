import React from 'react';
import MonsterService from '../services/MonsterService';

class MonsterComponent extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={
            monsters:[]
        };
    }

    componentDidMount()
    {
        MonsterService.getUsers().then((response)=>{
            this.setState({monsters: response.data});
        });
    }

    render()
    {
        return(
            <div>
                <h1 className="text-center"> Monsters: </h1>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>Name</td>
                            <td>Type</td>
                            <td>Age</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.monsters.map(
                                monster=>
                                <tr key={monster.id}>
                                    <td>{monster.id}</td>
                                    <td>{monster.name}</td>
                                    <td>{monster.type}</td>
                                    <td>{monster.age}</td>
                                </tr>    
                            )
                        }
                    </tbody>
                </table>
            </div>
        );
    }
}

export default MonsterComponent;