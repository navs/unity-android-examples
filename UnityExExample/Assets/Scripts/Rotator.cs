using UnityEngine;

public class Rotator : MonoBehaviour
{
    public float Speed = 25.0f;
    
    void Update()
    {
        transform.Rotate(Vector3.up * Speed);
    }
}
